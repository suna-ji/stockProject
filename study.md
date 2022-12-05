## 강의노트

### 1. 환경세팅
내 개발환경은 macOs이다.   
아래 링크를 참고하여 도커를 설치하고 사용하였다.   
https://dc7303.github.io/docker/2019/11/24/dockerInstallForMac/

### 2. Synchronized의 문제점
자바의 synchronized는 하나의 프로세스에 대해서만 보장을 한다.
따라서 서버가 여러대인 경우에는 데이터 접근이 여러곳에서 발생된다.
-> 거의 사용되지 않는다.

