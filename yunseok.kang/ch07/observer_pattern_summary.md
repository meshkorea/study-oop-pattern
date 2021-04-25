# Observer Pattern

#### What is it?

A design pattern in which an object, called the subject (publisher), maintains a list of its dependents, called observers (subscribers), and notifies them automatically of any state changes, usually by calling one of their methods.

#### When to use?

When you need many other objects to receive an update when another object changes

#### Benefits

Loose coupling (the publisher doesn't need to know anything about the subscribers)


Observer 목록을 관리; `add()`, `remove()` 를 사용해서 각각 observer를 등록 또는 삭제할 수 있다


> 옵서저 패턴을 구현할 때에 고려할 첫 번째 사항은 옵저버에 통지하는 시점을 결정하는 주체가 누가 되느냐에 대한 것이다.
>
> [...]
>
> 두 번째로 고려할 점은 옵저버의 인터페이스 개수에 대한 것이다. [...] 이렇게 한 주제 객체가 통지할 수 있는 상태 변경 내역의 종류가 다양한 경우에는 각 종류 별로 옵저버 인터페이스를 분리해서 구현하는 것이 좋다.
