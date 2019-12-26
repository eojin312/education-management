###시험 정보
> 서비스와 레파지토리를 개발하기 전에 DB 를 먼저
1. **시험 정보 리스트**
    2. 시험 일련번호
    3. 년도
    4. 학교
    5. 학기
    6. 중간/기말/수행
    7. 시작 날짜
    8. 종료 날짜
    9. 만드신 선생님
    10. 수정 날짜
    11. 수정하신 선생님
2. **시험에 응시한 학생**
    1. 학생 이름
    2. 학생 학년반
    3. 생성 날짜
    4. 작성하신 선생님
    5. 수정 날짜
    6. 수정하신 선생님
3. **시험 상세**
    1. 과목
    2. 만점
    3. 실제 점수
    4. 생성 날짜
    5. 작성하신 선생님
    6. 채점 일시
    7. 채점한 선생님
    
##12/26

**시험에 응시한 학생<ExamStudentApply>** 리스트를 나열하려고 쿼리를 짠 다음 테스트를 돌렸다.

Cause: java.lang.IllegalArgumentException: Mapped Statements collection does not contain value for findByExamNoWithStudent

이라는 에러 메시지가 떠서 해결하려한다.
1. mapper id가 다를경우
   - mapper 파일(MyBatis 의 쿼리문을 등록한 XML 파일)에 <select id=''.. 에 id와 
     mapper 파일에 직접 접근하는 java 파일(DAO 나 service)에 적어놓은 id 값이 다른 경우 **(주요 원인)** 
2. Parameter 와 bean 의 필드명이 틀린 경우
3. mapper 파일(MyBatis 의 쿼리문을 등록한 XML 파일)에 정의된 네임스페이스(namespace)와 
   mapper 파일에 직접 접근하는 java 파일 (DAO 나 service)에서 호출하는 네임스페이스(namespace)가 다를 경우

출처: https://daydreamer-92.tistory.com/76 


   