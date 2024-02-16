package com.study.insert_and_select.entity;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Student {
	private int studentId;
	private String name;
	private int age;
}
