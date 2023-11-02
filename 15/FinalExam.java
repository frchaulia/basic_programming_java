import java.util.Scanner;
 
public class FinalExam {
	
		public static String[] name, address;
		public static String[] position = {"Operator", "Supervisor", "Manager"};
		public static int[] group, totalSalary, overtimeHours, salaryCuts, nin;
		public static int[] insurance = {300000, 450000, 600000};
		public static int[] overtimeSalary = {900000, 800000, 700000, 600000, 500000, 400000, 300000, 200000, 100000};
		public static int[] groupBaseSalary = {3000000, 4000000, 5000000};
		public static int[] transportMoney = {100000, 150000, 200000};
		
		//Input Function
		static void inputData() {
			Scanner input = new Scanner(System.in);
			System.out.println("=================================");
			System.out.print("Enter the number of employees : ");
			int data = input.nextInt();
			System.out.println("=================================");
			name = new String[data];
			address = new String[data];
			group = new int[data];
			nin = new int[data];
			overtimeHours = new int[data];
			totalSalary = new int[data];
			salaryCuts = new int[data];
			System.out.println("");
			System.out.println("");
			
			for (int i = 0; i < name.length; i++) {
				System.out.println("Entering employee data " + (i + 1));
				Scanner in = new Scanner(System.in);
				System.out.println("--------------------------------------");
				System.out.print("Enter employee name             : ");
				name[i] = in.nextLine();
				System.out.print("Enter the employee class (1/2/3): ");
				group[i] = in.nextInt();
				if (group[i] == 1) {
					System.out.println("Position " + name[i] + " is " + position[0]);
				} else if (group[i] == 2) {
					System.out.println("Position " + name[i] + " is " + position[1]);
				} else {
					System.out.println("Position " + name[i] + " is " + position[2]);
				}
				System.out.print("National Identity Number (NIN)  : ");
				nin[i] = in.nextInt();
				System.out.print("Enter employee address          : ");
				in.nextLine();
				address[i] = in.nextLine();
				System.out.println("--------------------------------------");
				System.out.println("");
			}
			System.out.println("");
		}
		
		//Function to find employee data
		static void searchData() {
        Scanner ent = new Scanner(System.in);
        System.out.print("Enter employee name : ");
        String employeeData = ent.nextLine();
        System.out.println("");

			for (int k = 0; k < name.length; k++) {
				if (name[k].equals(employeeData)) {
					System.out.println("--- " + employeeData + " are " + (k + 1) + " ---");
					displayData(k);
					break;
				} else {
                System.out.println("--- " + employeeData + " not a " + (k + 1) + " ---");
				}
			}
		}
		
		//Function to display data
		public static void displayData(int x) {
			System.out.println("Employee name : " + name[x] + "\nGroup         : " + group[x] + "\nNIN           : " + nin[x] + "\nAddress       : " + address[x]);
			System.out.println("===========================================================");
		}

		//Function to display details of employee data
		static void employeeData() {
        System.out.println("");
        System.out.println("=========================== EMPLOYEE DETAILS =============================");
        System.out.println("");
        System.out.println("No.| Employee Name |   Group   |     NIN      |        Address        |");
        System.out.println("==========================================================================");
			for (int l = 0; l < name.length; l++) {
				System.out.println((l + 1) + "  |      " + (name[l] + "     |     " + group[l] + "     |      " + nin[l] + "       |        " + address[l] + "      |"));
			}
			System.out.println("-------------------------------------------------------------------------------");
		}
		
		//Function to calculate employee salaries
		public static void employeeSalary() {
			for (int i = 0; i < name.length; i++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("");
				System.out.print("Enter overtime hours " + name[i] + " (hours) : ");
				overtimeHours[i] = sc.nextInt();
				System.out.println("==================== EMPLOYEE SALARY SLIP ======================");
				if (group[i] != 2 && group[i] != 3) {
					if (overtimeHours[i] < 5) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[0] + overtimeSalary[2] + transportMoney[0];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[0]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[2]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[0]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[0];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					} else if (overtimeHours[i] >= 5 && 12 >= overtimeHours[i]) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[0] + overtimeSalary[1] + transportMoney[0];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[0]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[1]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[0]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[0];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					} else if (overtimeHours[i] < 13) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[0] + overtimeSalary[0] + transportMoney[0];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[0]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[0]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[0]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[0];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					}
				} else if (group[i] != 1 && group[i] != 3) {
					if (overtimeHours[i] < 5) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[1] + overtimeSalary[5] + transportMoney[1];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[1]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[5]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[1]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[1];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					} else if (overtimeHours[i] >= 5 && 12 >= overtimeHours[i]) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[1] + overtimeSalary[4] + transportMoney[1];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[1]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[4]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[1]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[1];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					} else if (overtimeHours[i] < 13) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[1] + overtimeSalary[3] + transportMoney[1];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[1]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[3]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[1]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[1];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					}
				} else if (group[i] != 1 && group[i] != 2) {
					if (overtimeHours[i] < 5) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[2] + overtimeSalary[8] + transportMoney[2];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[2]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[8]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[2]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[2];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					} else if (overtimeHours[i] >= 5 && 12 >= overtimeHours[i]) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[2] + overtimeSalary[7] + transportMoney[2];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[2]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[7]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[2]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[2];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					} else if (overtimeHours[i] < 13) {
						System.out.println("");
						totalSalary[i] = groupBaseSalary[2] + overtimeSalary[6] + transportMoney[2];
						System.out.println("Basic salary " + name[i] + "     : Rp " + groupBaseSalary[2]);
						System.out.println("Overtime salary " + name[i] + "  : Rp " + overtimeSalary[6]);
						System.out.println("Allowance salary " + name[i] + " : Rp " + transportMoney[2]);
						System.out.println("-------------------------------------------------- +");
						System.out.println("Total salary " + name[i] + "     : Rp " + totalSalary[i]);
						salaryCuts[i] = totalSalary[i] - insurance[2];
						System.out.println("Net salary " + name[i] + "       : Rp " + salaryCuts[i]);
						System.out.println("");
					}
				}
				System.out.println("===============================================================");
				System.out.println("");
				System.out.println("");
			}
		}
		
		//Function to print report
		static void printReport() {
			for (int i = 0; i < name.length; i++) {
				System.out.println(" |======================================|");
				System.out.println(" |              PRINT REPORT            |");
				System.out.println(" |======================================|");
				System.out.println(" | Employee name  : " + name[i] + "\t\t|");
				System.out.println(" | Group          : " + group[i] + "\t\t\t| ");
				System.out.println(" | NIN            : " + nin[i] + " \t\t| ");
				System.out.println(" | Address        : " + address[i] + "\t\t| ");
				if (group[i] != 2 && group[i] != 3) {
					if (overtimeHours[i] < 5) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[0] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[2] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[0] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[0] + "\t\t|");
						System.out.println(" | Position         : " + position[0] + "\t\t|");
					} else if (overtimeHours[i] >= 5 && 12 >= overtimeHours[i]) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[0] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[1] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[0] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[0] + "\t\t|");
						System.out.println(" | Position         : " + position[0] + "\t\t|");
					} else if (overtimeHours[i] < 13) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[0] + "\t|");
						System.out.println(" | Overtime salary      : Rp " + overtimeSalary[0] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[0] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[0] + "\t\t|");
						System.out.println(" | Position         : " + position[0] + "\t\t|");
					}
				} else if (group[i] != 1 && group[i] != 3) {
					if (overtimeHours[i] < 5) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[1] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[5] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[1] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[1] + "\t\t|");
						System.out.println(" | Position         : " + position[1] + "\t|");
					} else if (overtimeHours[i] >= 5 && 12 >= overtimeHours[i]) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[1] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[4] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[1] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[1] + "\t\t|");
						System.out.println(" | Position         : " + position[1] + "\t|");
					} else if (overtimeHours[i] < 13) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[1] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[3] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[1] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[1] + "\t\t|");
						System.out.println(" | Position         : " + position[1] + "\t|");
					}
				} else {
					if (overtimeHours[i] < 5) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[2] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[8] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[2] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[2] + "\t\t|");
						System.out.println(" | Position         : " + position[2] + "\t\t");
					} else if (overtimeHours[i] >= 5 && 12 >= overtimeHours[i]) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[2] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[7] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[2] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[2] + "\t\t|");
						System.out.println(" | Position         : " + position[2] + "\t\t|");
					} else if (overtimeHours[i] < 13) {
						System.out.println(" | Basic salary     : Rp " + groupBaseSalary[2] + "\t|");
						System.out.println(" | Overtime salary  : Rp " + overtimeSalary[6] + "\t\t|");
						System.out.println(" | Transport salary : Rp " + transportMoney[2] + "\t\t|");
						System.out.println(" | Insurance        : Rp " + insurance[2] + "\t\t|");
						System.out.println(" | Position         : " + position[2] + "\t\t|");
					}	
				}
				System.out.println(" |======================================|");
				System.out.println("");
			}
		}
		
		//main menu
		public static void main(String[] args) {
			int menu;
			System.out.println("===========================================================");
			System.out.println("      WELCOME TO INTERNATIONAL CLASS EMPLOYEE PAYROLL      ");
			System.out.println("===========================================================");
			do {
				System.out.println("");
				System.out.println("-------------INTERNATIONAL CLASS PAYROLL MENU-------------");
				System.out.println("1. Entering Employee Data");
				System.out.println("2. Search Employee Data");
				System.out.println("3. Viewing Employee Data");
				System.out.println("4. View Employee Salaries");
				System.out.println("5. Print Payroll Report");
				System.out.println("6. EXIT");
				System.out.println("");
				System.out.println("===========================================================");
				System.out.println("");
				
				Scanner choose = new Scanner(System.in);
				System.out.print("Enter Menu Options (1/2/3/4/5/6) : ");
				menu = choose.nextInt();
				System.out.println("");
				switch (menu) {
					case 1: {
						System.out.println("Menu - 1. Entering Employee Data");
						inputData();
					}
					break;
					case 2: {
						System.out.println("Menu - 2. Search Employee Data");
						searchData();
					}
					break;
					case 3: {
						System.out.println("Menu - 3. Viewing Employee Data");
						employeeData();
					}
					break;
					case 4: {
						System.out.println("Menu - 4. View Employee Salaries");
						employeeSalary();
					}
					break;
					case 5: {
						System.out.println("Menu - 5. Print Payroll Report");
						printReport();
					}
					break;
				}
			} while (menu > 0 && menu < 6);
		System.out.println("THANK YOU :D");
	}
}