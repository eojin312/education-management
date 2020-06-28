# Education-Management 
학사관리프로젝트
# 배경
스프링MVC를 이용한 토이프로젝트 진행이 필요했습니다
이 프로젝트를 진행하던 시점은 고등학생이었습니다
학교나 교육청에서 필요한 시스템인 나이스에 대해 구상해보게 되었습니다
학사관리를 축소한 토이프로젝트를 스프링MVC기반으로 만들기로 결심했습니다

**SpringBoot 를 들어가기 전에 수작업으로 jsp 와 mybatis 를 사용하여 framework 의 과정을 이해했습니다**

# 기술스택
  - JDK 11
  - maven
  - tomcat 7
  - jsp
    - bootstrap
    - sitemesh
  - mybatis
  - sitemesh
  - jquery
# 목표  
- 학사관리를 위한 최소한의 기능이 동작해야한다
  - 단, 선생님 관점에서 필요한 기능을 위주로 구현한다
- 스프링MVC를 충분히 활용한다
- 테스트코드를 충본히 작성한다
- layered acrchitecture를 구현한다
- DB설계를 경험한다

# Spring
**package구조**

layered acrchitecture 를 지켜서
- controller
- service
- repository
로 나눴습니다.

# ERD
- ERD상의 relation은 생략되어있고, 추후 최종 버전 작성예정

![eud-erd-2020-02-01-02](https://user-images.githubusercontent.com/45488643/73585625-5bb55a00-44e6-11ea-89b3-b7b4001455a3.png)

# 회고
- 레이어드 아키텍처를 통해 중복되는 코드를 없앴다.
- 프로그램이 복잡하지않아서 관리하기 쉬웠다 .
- 서블릿 경험을 통해 스프링 자동화를 충분히 이해하고 활용할 수 있었다.
- Bootstrap 를 사용해서 좀 더 보기 좋은 사이트로 만들 수 있었다 
- sitemesh 를 통한 중복되는 코드를 지울 수 있었다.
