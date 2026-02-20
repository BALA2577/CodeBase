package Interview;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewRepeatedQues {
	
	static List<Employee> employeeslist = Arrays.asList(
			new Employee(1, "Bala", 27, "IT", "Chennai", 200000, "Male"),
			new Employee(2, "Preetha", 27, "ServiveNow", "Chennai", 250000, "Female"),
			new Employee(3, "Charvik", 21, "Sports", "Chennai", 922000, "Male"),
			new Employee(4, "Priyan", 21, "IT", "Chennai", 229000, "Male"),
			new Employee(5, "Raji", 55, "Teaching", "VirudhuNagar", 72000, "Female"),
			new Employee(6, "Jaya", 50, "Business", "Chennai", 72000, "Female"),
			new Employee(7, "Jayanth", 22, "Teaching", "NewYork", 91500, "Male"),
			new Employee(8, "Jashwanth", 20, "Gaming", "Barcelona", 91000, "Male"),
			new Employee(9, "Banu", 75, "Teaching", "VirudhuNagar", 88000, "Male")
			);
	
	public static void main(String[] args) {

		//Employee Name starts with Given Letter 
		List<Employee> namestartswithP = employeeslist.stream().filter(emp->emp.getName().startsWith("P")).collect(Collectors.toList());
		System.out.println("Employees whose name starts with A \n" + namestartswithP);
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		//Group the employees with Department
		Map<String,List<Employee>> returndept = employeeslist.stream().collect(Collectors.groupingBy(e->e.getDepartNames()));
		
		Map<String,List<String>> returndeptu = employeeslist.stream().collect(Collectors.groupingBy
				(e->e.getDepartNames(),Collectors.mapping(emp->emp.getName(), Collectors.toList())));
		
//		Map<String,List<Employee>> returndeptMethodReference = employeeslist.stream().collect(Collectors.groupingBy(Employee::getDepartNames));
		System.out.println("Full Details "+returndept);
		
		System.out.println("Department and Name "+returndeptu);
		
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		//Count of Employees
		long TotalHeadcount = employeeslist.stream().count();
		System.out.println("Total Employees Working are "+TotalHeadcount);
		
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		int maxAge = employeeslist.stream().mapToInt(emp -> emp.getAge()).max().getAsInt();
		
		//find the names and age of the employees name as Key and Age as Value  
		
		Map<String,Integer> nameandage =employeeslist.stream().collect(Collectors.toMap(emp->emp.getName(), emp->emp.getAge()));
		System.out.println("Name and Age "+nameandage);
		
		System.out.println("---------------------------------------------------");
		
		//Find all department Names
		List<String> departmentnames = employeeslist.stream().map(emp->emp.getDepartNames()).collect(Collectors.toList());
		List<String> NamesofEmployee = employeeslist.stream().map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println("departmentnames "+departmentnames);
		System.out.println("EmployeeNames are "+NamesofEmployee);
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		//find the count of employees in each department
		Map<String,Long> CountinDept = employeeslist.stream().collect(Collectors.groupingBy(emp->emp.getDepartNames(),Collectors.counting()));
		System.out.println("Count in every department "+CountinDept);
		
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		//Salary between 70k and 3L
		Map<String,Double> Salarybetween = employeeslist.stream()
				.filter(emp->emp.getSalary()>70000 && emp.getSalary()<300000)
				.collect(Collectors.toMap(emp->emp.getName(), emp->emp.getSalary()));
		
		System.out.println("Salary between 70k and 3L "+Salarybetween);
		
		System.out.println("");
		System.out.println("---------------------------------------------------");   
		List<Employee> ageBetween26And30 = employeeslist.stream().filter(emp -> emp.getAge() < 30 && emp.getAge() > 12).collect(Collectors.toList());
		System.out.println("Young Employees are"+ageBetween26And30);
		Map<String,Integer> YoungEmployees = employeeslist.stream()
				.filter(emp->emp.getAge()>12 && emp.getAge()<30)
				.collect(Collectors.toMap(emp->emp.getName(), emp->emp.getAge()));
		System.out.println("Young Employees are"+YoungEmployees);
		
		List<Employee> emps = employeeslist.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println("Highest Earners"+emps);
	}

}
