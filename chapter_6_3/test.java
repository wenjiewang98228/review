package chapter_6_3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School sc = new School(101,"xxx-xx-xxx","156116516");
		Department dept1 = new Department("ox1561","��ѧ");
		Department dept2 = new Department("ox1575","��ѧ");
		Department dept3 = new Department("ox1545","Ӣ��");
		
		sc.addDept(dept1);
		sc.addDept(dept2);
		sc.addDept(dept3);
		
		System.out.println("ѧУ��" + sc.getName() + "/" + sc.getAddress() + "/" + sc.getPhone());
		for(int i = 0; i < sc.getDepartmentList().size(); i++) {
			System.out.println(sc.getDepartmentList().get(i).getDeptCode() + "  " + sc.getDepartmentList().get(i).getDeptName());
		}
	}

}
