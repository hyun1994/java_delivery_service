package org.delivery.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.delivery.db") // 멀티모듈일 시 패키지 파일명이 다를 경우 인식 못하는 문제점 해결
@EnableJpaRepositories(basePackages = "org.delivery.db")
public class JpaConfig {
}
