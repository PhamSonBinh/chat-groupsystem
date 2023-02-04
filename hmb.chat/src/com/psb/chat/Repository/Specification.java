package com.psb.chat.Repository;

public interface Specification<T> {
	boolean isExist(T t);
}
