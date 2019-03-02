package cn.justquiet.Service;

import java.util.List;

import cn.justquiet.Beans.Check;
import cn.justquiet.Beans.Student;
import cn.justquiet.Beans.Task;

public interface GatherBusiness {
	public List<Task> QueryTaskByTid(int tid, int status);//每次查询都要计算是否已过期,Task对象里面有下面方法所需的参数
	public List<Check> QueryCheckByTkcodes(String tkcodes, int status);//获得status为1的已提交的同学
	public List<Student> QueryCheckNotDone(String tkcodes, int status);//获得status为0的未提交的同学
	public int QueryClassMember(int cid);//查询班级总人数
	public String QueryCutoff(String tkcodes);//查询显示截止日期（无论有没有人上交作业都可以得到截止日期）
}