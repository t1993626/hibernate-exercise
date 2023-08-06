package web.emp.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Emp {
	@Id
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Timestamp hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
	@ManyToOne
	@JoinColumn(name = "DEPTNO",insertable = false,updatable = false)
	private Dept dept;
}
