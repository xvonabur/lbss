package ru.otr.lbss.service.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

import cxc.jex.common.application.config.ConfigService;

public class LbssConfigService implements ConfigService {
	private static Logger log = LoggerFactory.getLogger(ConfigService.class);

	private Environment environment;

	public LbssConfigService(Environment environment) {
		this.environment = environment;
	}

	@PostConstruct
	private void init() {
		log.info("init : " + environment.getProperty("__OK"));
	}

	@PreDestroy
	private void fina() {
		log.info("fina");
	}

	@Override
	public String getString(String key) {
		return environment.getProperty(key);
	}

	@Override
	public String getString(String key, String defaultValue) {
		return environment.getProperty(key, defaultValue);
	}

	@Override
	public Integer getInteger(String key) {
		return new Integer(environment.getProperty(key));
	}

	@Override
	public Integer getInteger(String key, int defaultValue) {
		return new Integer(environment.getProperty(key, String.valueOf(defaultValue)));
	}

	@Override
	public Long getLong(String key) {
		return new Long(environment.getProperty(key));
	}

	@Override
	public Long getLong(String key, long defaultValue) {
		return new Long(environment.getProperty(key, String.valueOf(defaultValue)));
	}

	@Override
	public Boolean getBoolean(String key) {
		return new Boolean(environment.getProperty(key));
	}

	@Override
	public Boolean getBoolean(String key, boolean defaultValue) {
		return new Boolean(environment.getProperty(key, String.valueOf(defaultValue)));
	}

}