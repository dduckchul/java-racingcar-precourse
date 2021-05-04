# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


# 기능 구현 사항

## 1. 자동차(Car) 생성
* 입력된 이름으로 자동차를 생성한다.
* 자동차의 현재 위치를 저장한다. (위치값 저장)
* 자동차를 이동하는 기능 만든다. (앞으로 이동)
* 현재 자동차의 위치를 출력하는 기능 만든다. (이름 + 위치)

## 1-1 위치 생성
* 위치의 숫자 > '-' 텍스트로 전환 로직 구현
* 앞으로 이동, 뒤로 이동 등 위치값 변경에대한 메서드 구현

## 2. 경주(Racing) 클래스 생성
* 경주의 총 횟수를 저장해 둔다. (시도 횟수)
* 경주의 룰을 구현한다. (랜덤값 0-9 돌려서, 4이상 전진, 3이하 정지)

## 3. Racers 클래스 생성
* 참가하는 자동차 컬렉션을 저장해둔다.
* String 입력하면 List 저장하는 생성자 구현
* 우승자를 선정하는 기능 구현.
  * 가장 위치가 먼 자동차들을 리턴한다.

## 4. CarRacing 클래스 생성
* 게임 진행하는데 사용하는 로직 생성
  * 사용자가 지정하는 값을 입력받는 기능.
  * 출력시 원하는 값을 표시하는 기능.

## 5. 기타 텍스트 분리
* 하드코딩하는 텍스트들 저장하는 클래스 만든다.