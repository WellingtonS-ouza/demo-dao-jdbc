package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

		System.out.println("=== TEST 1: department findById =====");
		Department department = departmentDao.findById(8);
		System.out.println(department);

		System.out.println("\n=== TEST 2: seller findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: department update =====");
		department = departmentDao.findById(8);
		department.setName("Cars");
		departmentDao.update(department);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 4: department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();

		/*
		 * System.out.println("\n=== TEST 5: department insert ====="); Department
		 * newDepartment = new Department(null, "Clothes");
		 * departmentDao.insert(newDepartment); System.out.println("Inserted new id = "
		 * + newDepartment.getId());
		 */

		departmentDao.deleteById(id);
		System.out.println("Delete Completed! ");

		sc.close();

	}

}
