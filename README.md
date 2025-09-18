# Calculator-project
계산기를 만들어보자!


##프로젝트 영상



[![YouTube Video](https://img.youtube.com/vi/QuezFEhj8Wo/0.jpg)](https://youtu.be/QuezFEhj8Wo?si=wsDnkwcKvNhqpfj0)



## 프로젝트 소개
Java로 구현한 사칙연산 계산기 프로젝트입니다.  
- 기본적인 사칙연산 수행  
- 계산 결과 저장 및 관리  
- Enum, 제네릭, 람다/스트림 활용한 Lv3 기능 포함  

---

## 프로젝트 구조

calculator-project/
├── src/
│ └── calculator/
│ ├── App.java # 실행 진입점
│ ├── ArithmeticCalculator.java # 제네릭 계산기 클래스
│ └── OperatorType.java # 사칙연산 Enum 정의
└── out/ # 컴파일된 클래스 파일 (자동 생성)

yaml
코드 복사

- **App.java**: 사용자 입력 처리 및 프로그램 실행  
- **ArithmeticCalculator.java**: 계산 수행, 결과 저장, 조건 검색 기능  
- **OperatorType.java**: Enum으로 사칙연산 정의  

---

##주요 기능
-두 숫자와 연산자를 입력하면 결과 출력

-계산 결과를 리스트에 저장, 가장 오래된 결과 삭제 가능

-Enum으로 연산자 관리, 제네릭으로 다양한 숫자 타입 지원

-Lambda & Stream으로 특정 조건의 결과 조회 가능

