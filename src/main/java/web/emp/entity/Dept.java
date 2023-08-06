package web.emp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Dept {
	@Id
	private Integer deptno;
	private String dname;
	private String loc;
	@OneToMany(mappedBy = "dept")
//	@JoinColumn(name = "DEPTNO", referencedColumnName = "DEPTNO")
	private List<Emp> emps;

}
