package cn.edu.ncut.test;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Task;
import org.junit.Assert;
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
    TaskService taskService;

    @Test
    public void testFindByPubnameStartingWithAndPubtype() {
        Deployment deployment = repositoryService.createDeployment().addClasspathResource("diagrams/product_audit.bpmn").deploy();
        //查询流程定义

    }


}
