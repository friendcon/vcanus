# vcanus 과제전형
결과 실행(?)은 Main 클래스의 main 함수를 실행하면 구현된 결과를 볼 수 있습니다..!
🌿 1번
- `BreadType.class` : enum으로 BreadType 선언
- `Bread.class` : 상속을 받을 수 있도록 `open` 으로 클래스 선언. 공통되는 부분인 `breadType`, `flour`, `water` 멤버변수가 있습니다
- `ButerBread.class` , `CreamBread.class`, `SugarBread.class` : `Bread` 를 상속받고 멤버변수 한개는 각 클래스마다 다릅니다. `toString` 을 오버라이딩하여 형식을 바꾸었습니다.
- `BreadFactory.class` : breadType에 따라 Bread 를 생성해주는 팩토리 객체입니다. `getBread(request: BreadRequest, breadTypeItem: Int)` 를 통해 객체생성결과를 받을 수 있습니다. bread의
공통 부분은 breadRequest 로 묶고(?) breadTypeItem 은 각 Bread마다 다른 재료 요소(?)에 대한 값을 저장합니다.
- `No1Solution.class` : no1 의 답,, `jsonparser`, `jsonobject`, `jsonarray` 를 사용하여 파일처리..

🌿 2번
- `add` , `subtract` 메서드가 실행될 때 객체 자기자신을 리턴하여 빌더(?) 형식으로 구현

🌿 3번
- 알고있는 방식대로 풀었습니다 (?) 

🌿 4번 (못푼문제)
- 재귀적인 호출대신 스택을 사용한다는 사실(?) 만 알고있습니다. 어떤방식으로 구현해야할지 모르겠어서 풀지 못했습니다.

🌿 5번 (못푼문제)
- dfs(?) 로 풀어야할 문제라는 사실(?) 만 알고있습니다.. 5번도 어떤 방식으로 구현해야할지 모르겠어서 풀지 못했습니다. 


