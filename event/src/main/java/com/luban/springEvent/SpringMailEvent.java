package com.luban.springEvent;

import org.springframework.context.ApplicationEvent;

public class SpringMailEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private String content;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public SpringMailEvent(Object source) {
		super(source);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
