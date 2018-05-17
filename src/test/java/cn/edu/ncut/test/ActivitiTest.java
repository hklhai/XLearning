package cn.edu.ncut.test;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/3.
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ActivitiTest {
    @Resource
    private RepositoryService repositoryService;
    @Resource
    private RuntimeService runtimeService;
    @Resource
    private TaskService taskService;
    @Resource
    private HistoryService historyService;

    @Test
    public void runTimeInfo() {
//        Deployment deployment = repositoryService.createDeployment().addClasspathResource("diagrams/product_audit.bpmn").deploy();
        //查询流程定义
        String nextAssignee = (String) taskService.getVariable("5005", "nextAssignee");
        String productid = (String) taskService.getVariable("5005", "productid");
        System.out.println(nextAssignee + ":" + productid);
    }

    @Test
    public void historyInfo() {
        String processInstanceId = "5005";
        List<HistoricVariableInstance> list = historyService.createHistoricVariableInstanceQuery()
                .processInstanceId(processInstanceId).list();

        if (list != null && list.size() > 0) {
            for (HistoricVariableInstance hvi : list) {
                System.out.println(hvi.getId() + "    " + hvi.getVariableName() + "   " + hvi.getValue());
            }
        }
    }


    @Test
    public void startTask() {
        //根据bpmn文件部署流程
        Deployment deployment = repositoryService.createDeployment().addClasspathResource("diagrams/product_audit.bpmn").deploy();
        //获取流程定义
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().deploymentId(deployment.getId()).singleResult();
        //启动流程定义，返回流程实例
        ProcessInstance pi = runtimeService.startProcessInstanceById(processDefinition.getId());
        String processId = pi.getId();
        System.out.println("流程创建成功，当前流程实例ID：" + processId);

        Task task = taskService.createTaskQuery().processInstanceId(processId).singleResult();

        runtimeService.setVariable(task.getExecutionId(), "testId", "10002");
        System.out.println("第一次执行前，任务名称：" + task.getName());
        taskService.complete(task.getId());
    }

}
