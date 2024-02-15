package com.khasanovtr.EmployeeManager;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManagerService {
    List<Employee> employees = new ArrayList<>();
    private final int MAX_WIDTH = 20;
}

