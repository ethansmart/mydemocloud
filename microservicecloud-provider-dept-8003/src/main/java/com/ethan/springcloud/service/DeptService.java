package com.ethan.springcloud.service;

import java.util.List;

import com.ethan.springcloud.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
