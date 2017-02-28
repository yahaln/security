package com.security.webc.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;
import com.security.webc.dao.V_ResPermissionRepositoryDao;
import com.security.webc.entity.V_ResPermission;
import java.util.*;
import java.util.Map.Entry;

/**
 * 
 *
 * @author yanghualin
 * @version
 * @since
 */
@Service
public class InvocationSecurityMetadataSourceServiceImpl implements FilterInvocationSecurityMetadataSource {
	@Autowired
	private V_ResPermissionRepositoryDao resDao;// 資源表

	private static Map<String, Collection<ConfigAttribute>> pmMap = null;

	// 此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
	// 因为我不想每一次来了请求，都先要匹配一下权限表中的信息是不是包含此url，
	// 我准备直接拦截，不管请求的url 是什么都直接拦截，然后在MyAccessDecisionManager的decide
	// 方法中做拦截还是放行的决策。
	// 所以此方法的返回值不能返回 null 此处我就随便返回一下。
	@Override
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		// 获取请求的url地址
		String url = ((FilterInvocation) object).getRequestUrl();
		System.out.println("请求地址：" + url);
		// 查询数据库获取所有url对应的权限
		if (pmMap == null) {
			pmMap = loadResourceMatchAuthority();
		}
		// 根据用户访问的url来获取访问该url应该具备的权限id
		Collection<ConfigAttribute> collection = pmMap.get(url);
		if (collection == null) {
			collection = new ArrayList<ConfigAttribute>();
			ConfigAttribute configAttribute = new SecurityConfig("");
			collection.add(configAttribute);
		}
		return collection;
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	private Map<String, Collection<ConfigAttribute>> loadResourceMatchAuthority() {
		Map<String, Collection<ConfigAttribute>> map = new HashMap<String, Collection<ConfigAttribute>>();
		Map<String, String> configs = getResourcesConfig();
		for (Entry<String, String> entry : configs.entrySet()) {
			Collection<ConfigAttribute> list = new ArrayList<ConfigAttribute>();
			String[] vals = entry.getValue().split(",");
			for (String val : vals) {
				ConfigAttribute config = new SecurityConfig(val);
				list.add(config);
			}
			map.put(entry.getKey(), list);
		}
		return map;
	}

	private Map<String, String> getResourcesConfig() {
		Map<String, String> map = new HashMap<String, String>();
		List<V_ResPermission> list_res = resDao.findAll();
		for (V_ResPermission rp : list_res) {
			map.put(rp.getRsurl(), rp.getPermissionid());
		}
		return map;
	}
}
