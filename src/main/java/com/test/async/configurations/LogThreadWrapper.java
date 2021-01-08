package com.test.async.configurations;

import java.util.Map;

import org.slf4j.MDC;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class LogThreadWrapper extends ThreadPoolTaskExecutor {

	private static final long serialVersionUID = 1L;

	public LogThreadWrapper() {
		super();
	}

	@Override
	public void execute(Runnable task) {
		super.execute(wrap(task, MDC.getCopyOfContextMap()));
	}

	public static Runnable wrap(final Runnable runnable, final Map<String, String> context) {
		return new Runnable() {
			@Override
			public void run() {
				Map<String, String> previousContext = MDC.getCopyOfContextMap();
				if (context == null) {
					MDC.clear();
				} else {
					MDC.setContextMap(context);
				}
				try {
					runnable.run();
				} finally {
					if (previousContext == null) {
						MDC.clear();
					} else {
						MDC.setContextMap(previousContext);
					}
				}
			}
		};

	}

}