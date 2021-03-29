package application.isp;

//TODO : 제네릭을 사용하지 말고 더 상위의 추상화된 타입을 사용해서 변경하면 형변환을 하지 않아도 된다는 조언!! 해보기
public interface DataLoaderHelper<T> {

  T helpLoadingData();

}
