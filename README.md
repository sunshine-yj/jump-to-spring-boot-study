# 점프 투 스프링부트 학습 기록

[점프 투 스프링부트]를 따라 공부하며
실습 코드와 학습 내용, 오류 해결 과정을 기록하는 저장소입니다.

## 학습 목표

- Spring Boot 프로젝트의 구조와 동작 방식 이해하기
- 질문과 답변을 작성하는 게시판 서비스 구현하기
- 데이터베이스 연동부터 서비스 배포까지 경험하기
- 학습 과정에서 발생한 문제와 해결 방법 기록하기

## 개발 환경

| 항목 | 버전 및 도구 |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.8 |
| Gradle | 9.8.1 |
| 빌드 설정 | Gradle - Groovy |
| IDE | IntelliJ IDEA |
| 형상 관리 | Git / GitHub |

※ 버전은 현재 프로젝트 설정을 기준으로 작성했습니다.

## 학습 기록

| 주제 | 학습 내용 |
|---|---|
| 개발 환경 구성 | JDK와 프로젝트 Java 버전의 차이 이해 |
| Git 설정 | 원격 저장소 연결 및 .gitignore 역할 이해 |
| 커밋 메시지 | feat, fix, docs 등 커밋 타입 학습 |

## 실행 방법

JDK 17을 준비한 뒤 프로젝트 루트에서 실행합니다.

### 애플리케이션 실행 — Windows PowerShell

```powershell
.\gradlew.bat bootRun
```

### 테스트 실행 — Windows PowerShell

```powershell
.\gradlew.bat test
```

## 참고 자료

- [점프 투 스프링부트](https://wikidocs.net/book/7601)
- [Spring Boot 공식 문서](https://docs.spring.io/spring-boot/)
