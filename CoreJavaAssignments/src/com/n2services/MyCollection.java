package com.n2services;

import java.util.Set;

class MyCollection<I>{
	private Set<I> set;
	public Set<I>getCollection(){
		return this.set;
	}
	public void TestCollection(MyCollection<?> collection)
	{
		Set<I> set= (Set<I>) collection.getCollection();
	}
}

