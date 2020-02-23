package com.soft1851.seven.homework.four;

import java.util.Objects;

/**
 * @ClassName Consumer
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/23
 **/
@FunctionalInterface
public interface Consumer<T> {
    /**
     * 函数式方法accept
     * @param t
     */
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}