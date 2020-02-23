package com.soft1851.seven.homework.four;

/**
 * @ClassName Callable
 * @Description Callable接口
 * @Author 田震
 * @Date 2020/2/22
 **/
@FunctionalInterface
public interface Callable<T> {
    void accept(T t);

//    default Callable<T> andThen(Callable<? super T> after) {
//        Objects.requireNonNull(after);
//        return (T t) -> { accept(t); after.accept(t); };
//    }
}