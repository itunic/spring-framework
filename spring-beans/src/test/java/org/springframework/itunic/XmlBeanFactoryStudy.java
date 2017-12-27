package org.springframework.itunic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFactoryStudy {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-study.xml"));
	}
}
