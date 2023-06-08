package com.yupi.springbootinit.manager;

import com.yupi.springbootinit.model.entity.Chart;
import com.yupi.springbootinit.service.ChartService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Cos 操作测试
 *
 
 */
@SpringBootTest
@Slf4j
class AIMangerTest {

    @Autowired
    private AIManager aiManager;

    @Resource
    private ChartService chartService;

    @Test
    void a(){
        String genChart = "以下是前端Echarts V5的 option 配置对象，对用户表数据进行可视化：\n" +
                "\n" +
                "{\n" +
                "  \"title\": {\n" +
                "    \"text\": \"每日用户数统计\"\n" +
                "  },\n" +
                "  \"xAxis\": {\n" +
                "    \"type\": \"category\",\n" +
                "    \"data\": [\"1号\",\"2号\",\"3号\",\"4号\",\"5号\",\"6号\"]\n" +
                "  },\n" +
                "  \"yAxis\": {\n" +
                "    \"type\": \"value\"\n" +
                "  },\n" +
                "  \"series\": [\n" +
                "    {\n" +
                "      \"data\": [10,20,30,110,70,30],\n" +
                "      \"type\": \"line\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        int count = genChart.split(String.valueOf('\"')).length - 1;
        if (count < 6){
            handleChartUpdateError(1666741920428171265L,"AI 生成错误");
            return;
        }
        if (genChart.charAt(0) != '{'){
            int indexes = genChart.indexOf('{');
            genChart = genChart.substring(indexes);
        }

        System.out.println(genChart);

    }

    private void handleChartUpdateError(long chartId, String execMessage){
        Chart updateChartResult = new Chart();
        updateChartResult.setId(chartId);
        updateChartResult.setStatus("failed");
        updateChartResult.setExecMessage(execMessage);
        boolean updateReuslt = chartService.updateById(updateChartResult);
        if (!updateReuslt) {
            log.error("更新图表失败状态失败" + chartId + "," + execMessage) ;
        }
    }



}