package com.luban.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

@Configuration
public class DBConfig implements ImportAware {

	String name;

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		importMetadata.getMetaAnnotationTypes("appconfig");
	}
}
