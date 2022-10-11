package com.ypw;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class RestTemplateTest  {
    // @Autowired
    // RestTemplate restTemplate;

    @Test
    public void testRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json;charset=UTF-8");
        requestHeaders.set("appId", "konsung");
        requestHeaders.set("timestamp", "1561975500000");
        requestHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity requestEntity = new HttpEntity("{\n" +
                "    \"healthExamParam\": {\n" +
                "        \"assistResultOther\": \"无\",\n" +
                "        \"barrelChest\": \"1\",\n" +
                "        \"bedHistoryParamList\": [\n" +
                "            {\n" +
                "                \"hospitalName\": \"杭州武警医院\",\n" +
                "                \"offDate\": \"2019-05-29\",\n" +
                "                \"createDate\": \"2019-01-28\",\n" +
                "                \"reason\": \"饿饿反复强调\",\n" +
                "                \"diseaseNo\": \"45666777\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"hospitalName\": \"杭州浙大附属医院\",\n" +
                "                \"offDate\": \"2019-05-29\",\n" +
                "                \"createDate\": \"2019-01-28\",\n" +
                "                \"reason\": \"高血压\",\n" +
                "                \"diseaseNo\": \"1112233\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"breast\": 0,\n" +
                "        \"breastOther\": \"无\",\n" +
                "        \"breathRate\": \"89\",\n" +
                "        \"breathSound\": \"1\",\n" +
                "        \"breathSoundDescribe\": \"无\",\n" +
                "        \"cariesLeftLower\": \"无\",\n" +
                "        \"cariesLeftUpper\": \"无\",\n" +
                "        \"cariesRightLower\": \"无\",\n" +
                "        \"cariesRightUpper\": \"无\",\n" +
                "        \"cervical\": \"0\",\n" +
                "        \"cervicalDescribe\": \"无\",\n" +
                "        \"cervicalSmear\": \"1\",\n" +
                "        \"cervicalSmearDescribe\": \"无\",\n" +
                "        \"checkOther\": \"无\",\n" +
                "        \"chemProtect\": \"1\",\n" +
                "        \"chemicalProtectDescribe\": \"无\",\n" +
                "        \"chemicals\": \"化学物质名称\",\n" +
                "        \"createTime\": \"2019-05-29 10:16:32\",\n" +
                "        \"cvd\": \"5\",\n" +
                "        \"cvdOthers\": \"无\",\n" +
                "        \"cxr\": \"1\",\n" +
                "        \"cxrDescribe\": \"无\",\n" +
                "        \"denture\": \"2\",\n" +
                "        \"dentureLeftLower\": \"无\",\n" +
                "        \"dentureLeftUpper\": \"无\",\n" +
                "        \"dentureRightLower\": \"无\",\n" +
                "        \"dentureRightUpper\": \"无\",\n" +
                "        \"detectTime\": \"2019-05-29 10:16:32\",\n" +
                "        \"deviceId\": \"测试设备编号\",\n" +
                "        \"doctorName\": \"测试医生\",\n" +
                "        \"drinkBeginAge\": \"42\",\n" +
                "        \"drinkRate\": \"2\",\n" +
                "        \"drinkType\": \"1\",\n" +
                "        \"drinkTypeOthers\": \"其他酒类\",\n" +
                "        \"drinkWeight\": \"4\",\n" +
                "        \"drugUseParamList\": [\n" +
                "            {\n" +
                "                \"unit\": \"ml\",\n" +
                "                \"useCompliance\": 1,\n" +
                "                \"useAmount\": \"56\",\n" +
                "                \"useStyle\": \"口服\",\n" +
                "                \"useDATE\": \"一天一次（早）\",\n" +
                "                \"describe\": \"按时吃药\",\n" +
                "                \"drugName\": \"青霉素\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"unit\": \"ml\",\n" +
                "                \"useCompliance\": 1,\n" +
                "                \"useAmount\": \"3\",\n" +
                "                \"useStyle\": \"口服\",\n" +
                "                \"useDATE\": \"一天两次（早晚）\",\n" +
                "                \"describe\": \"按时吃药\",\n" +
                "                \"drugName\": \"阿莫西林\"\n" +
                "            }\n" +
                "            \n" +
                "        ],\n" +
                "        \"dust\": \"粉尘\",\n" +
                "        \"dustProtect\": \"2\",\n" +
                "        \"dustProtectDescribe\": \"无粉尘防护\",\n" +
                "        \"edema\": \"2\",\n" +
                "        \"elderlyCognition\": \"2\",\n" +
                "        \"elderlyCognitionCount\": \"89\",\n" +
                "        \"elderlyEmotion\": 2,\n" +
                "        \"elderlyEmotionCount\": \"45\",\n" +
                "        \"elderlyHealth\": \"2\",\n" +
                "        \"elderlySelfCare\": \"2\",\n" +
                "        \"enclosure\": \"0\",\n" +
                "        \"enclosureDescribe\": \"无\",\n" +
                "        \"examinationUnit\": \"杭州唯一\",\n" +
                "        \"eyeDisease\": \"2\",\n" +
                "        \"eyeDiseaseOthers\": \"无\",\n" +
                "        \"eyegroundException\": \"1\",\n" +
                "        \"eyegroundExceptionDescribe\": \"无\",\n" +
                "        \"fever\": \"2\",\n" +
                "        \"feverDescribe\": \"无\",\n" +
                "        \"filedTime\": 1560220045,\n" +
                "        \"fob\": \"2\",\n" +
                "        \"fobDescribe\": \"无\",\n" +
                "        \"footBeat\": \"2\",\n" +
                "        \"hbsAntigen\": \"2\",\n" +
                "        \"healthContent\": \"2,3\",\n" +
                "        \"healthEvaluateException1\": \"无\",\n" +
                "        \"healthEvaluateException2\": \"无\",\n" +
                "        \"healthEvaluateException3\": \"无\",\n" +
                "        \"healthEvaluateException4\": \"无\",\n" +
                "        \"healthEvaluateException5\": \"无\",\n" +
                "        \"healthEvaluateException6\": \"无\",\n" +
                "        \"healthEvaluateException7\": \"无\",\n" +
                "        \"healthEvaluateException8\": \"无\",\n" +
                "        \"healthEvaluateIsException\": \"无\",\n" +
                "        \"hearing\": \"1\",\n" +
                "        \"heartDisease\": \"2\",\n" +
                "        \"heartDiseaseOthers\": \"无\",\n" +
                "        \"heartNoise\": \"2\",\n" +
                "        \"heartNoiseDescribe\": \"无\",\n" +
                "        \"heartRate\": \"99\",\n" +
                "        \"heartRateState\": \"1\",\n" +
                "        \"hospitalizationHistoryParamList\": [\n" +
                "            {\n" +
                "                \"diseaseNo\": \"6666\",\n" +
                "                \"hospitalName\": \"杭州市人民医院\",\n" +
                "                \"inDate\": \"2019-05-29\",\n" +
                "                \"offDate\": \"2019-05-29\",\n" +
                "                \"reason\": \"感冒发烧\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"diseaseNo\": \"123456\",\n" +
                "                \"hospitalName\": \"杭州市浙大附属医院\",\n" +
                "                \"inDate\": \"2019-05-29\",\n" +
                "                \"offDate\": \"2019-05-29\",\n" +
                "                \"reason\": \" 糖尿病\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"hypodontiaLeftLower\": \"无\",\n" +
                "        \"hypodontiaLeftUpper\": \"无\",\n" +
                "        \"hypodontiaRightLower\": \"无\",\n" +
                "        \"hypodontiaRightUpper\": \"无\",\n" +
                "        \"isNotContact\": \"2\",\n" +
                "        \"isNotQuitDrink\": \"2\",\n" +
                "        \"kdDisease\": \"2\",\n" +
                "        \"kdDiseaseOthers\": \"无\",\n" +
                "        \"leftCorrectedVision\": \"4\",\n" +
                "        \"leftVision\": \"4.5\",\n" +
                "        \"lips\": \"1\",\n" +
                "        \"lymphadenState\": \"1\",\n" +
                "        \"lymphadenStateOther\": \"无\",\n" +
                "        \"masses\": \"2\",\n" +
                "        \"massesDescribe\": \"无\",\n" +
                "        \"mealCustom\": \"2,3\",\n" +
                "        \"neuralDisease\": \"2\",\n" +
                "        \"neuralDiseaseDescribe\": \"无\",\n" +
                "        \"number\": \"12345678\",\n" +
                "        \"otherDisease\": \"2\",\n" +
                "        \"otherDiseaseDescribe\": \"无\",\n" +
                "        \"otherPoisons\": \"无\",\n" +
                "        \"otherProtect\": \"无\",\n" +
                "        \"otherProtectDescribe\": \"无\",\n" +
                "        \"palace\": \"0\",\n" +
                "        \"palaceDescribe\": \"无\",\n" +
                "        \"pharynx\": \"2\",\n" +
                "        \"physicaProtectDescribe\": \"无\",\n" +
                "        \"physical\": \"无\",\n" +
                "        \"physikProtect\": \"0\",\n" +
                "        \"quitDrinkAge\": \"45\",\n" +
                "        \"radiogen\": \"无\",\n" +
                "        \"radiogenProtect\": \"0\",\n" +
                "        \"radiogenProtectDescribe\": \"无\",\n" +
                "        \"rale\": \"2\",\n" +
                "        \"raleOther\": \"无\",\n" +
                "        \"recentYearDrunk\": \"0\",\n" +
                "        \"rectalTouch\": \"2\",\n" +
                "        \"rectalTouchOther\": \"无\",\n" +
                "        \"reteDisease\": \"2\",\n" +
                "        \"reteDiseaseOthers\": \"无\",\n" +
                "        \"rightCorrectedVision\": \"4\",\n" +
                "        \"rightVision\": \"5\",\n" +
                "        \"riskControl\": \"2,3\",\n" +
                "        \"riskControlOther\": \"无\",\n" +
                "        \"riskControlVaccinate\": \"无\",\n" +
                "        \"riskControlWeight\": \"无\",\n" +
                "        \"scleralState\": \"2\",\n" +
                "        \"scleralStateOther\": \"无\",\n" +
                "        \"serviceAuthenticationSource\": \"0\",\n" +
                "        \"serviceAuthenticationStatus\": \"0\",\n" +
                "        \"shiftingDullness\": \"2\",\n" +
                "        \"shiftingDullnessDescribe\": \"无\",\n" +
                "        \"skinState\": \"1\",\n" +
                "        \"skinStateOther\": \"无\",\n" +
                "        \"smokeAverage\": \"2\",\n" +
                "        \"smokeBeginAge\": \"18\",\n" +
                "        \"smokeCessationAge\": \"11\",\n" +
                "        \"smokeState\": \"1\",\n" +
                "        \"splenoma\": \"2\",\n" +
                "        \"splenomaDescribe\": \"无\",\n" +
                "        \"sport\": \"1\",\n" +
                "        \"symptom\": \"17,12,22,6,7\",\n" +
                "        \"symptomOthers\": \"无\",\n" +
                "        \"tenderness\": \"2\",\n" +
                "        \"tendernessDescribe\": \"无\",\n" +
                "        \"trainingDate\": \"3\",\n" +
                "        \"trainingRate\": \"1\",\n" +
                "        \"trainingStyle\": \"跑步\",\n" +
                "        \"trainingTime\": \"35\",\n" +
                "        \"updateTime\": \"2019-05-29 10:17:09\",\n" +
                "        \"vaccinateHistory\": \"无\",\n" +
                "        \"vaccinateHistoryParamList\": [\n" +
                "            {\n" +
                "                \"vaccinateOrg\": \"杭州幼儿医院\",\n" +
                "                \"vaccinateDate\": \"2019-05-29\",\n" +
                "                \"vaccinateName\": \"乙肝疫苗\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"vaccinateOrg\": \"杭州幼儿医院\",\n" +
                "                \"vaccinateDate\": \"2019-05-29\",\n" +
                "                \"vaccinateName\": \"丙肝疫苗\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"vagina\": \"0\",\n" +
                "        \"vaginaDescribe\": \"无\",\n" +
                "        \"villageCode\": \"无\",\n" +
                "        \"vulva\": \"0\",\n" +
                "        \"vulvaDescribe\": \"无\",\n" +
                "        \"waist\": \"66\",\n" +
                "        \"workType\": \"工人\",\n" +
                "        \"workYear\": \"15\"\n" +
                "    },\n" +
                "    \"personInfo\": {\n" +
                "        \"pid\": 0,\n" +
                "        \"cardType\": 1,\n" +
                "        \"idcard\": \"110101198001010010\",\n" +
                "        \"realName\": \"张鹏\",\n" +
                "        \"phone\": \"18888888888\",\n" +
                "        \"birthday\": \"1980-01-01\",\n" +
                "        \"gender\": 1\n" +
                "    },\n" +
                "    \"bloodPressure\": {\n" +
                "        \"leftSbp\": \"127\",\n" +
                "        \"leftDbp\": \"87\",\n" +
                "        \"leftMbp\": \"134\",\n" +
                "        \"rightSbp\": \"135\",\n" +
                "        \"rightDbp\": \"79\",\n" +
                "        \"rightMbp\": \"90\",\n" +
                "        \"sbp\": \"156\",\n" +
                "        \"dbp\": \"78\",\n" +
                "        \"mbp\": \"90\",\n" +
                "        \"unit\": \"mmHg\",\n" +
                "        \"bpPr\": \"68\",\n" +
                "        \"detectTime\": \"2019-06-17 10:21:23\",\n" +
                "        \"symptom\": \"头晕恶心\",\n" +
                "        \"advice\": \"注意休息\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    },\n" +
                "    \"bScan\": {\n" +
                "        \"abdominalBUltrasound\": 1,\n" +
                "        \"abdominalDiagnosis\": \"正常\",\n" +
                "        \"abdominalDiagnosisDetails\": \"正常\",\n" +
                "        \"detectTime\": \"2019-06-17 10:16:32\",\n" +
                "        \"deviceId\": \"测试设备 ID\",\n" +
                "        \"othersBUltrasound\": 0,\n" +
                "        \"othersDiagnosis\": \"无\",\n" +
                "        \"othersDiagnosisDetails\": \"无\",\n" +
                "        \"pictureFour\": \"\",\n" +
                "        \"pictureOne\": \"\",\n" +
                "        \"pictureThree\": \"\",\n" +
                "        \"pictureTwo\": \"\",\n" +
                "        \"ultrasonographyid\": 0\n" +
                "    },\n" +
                "    \"bloodSugar\": {\n" +
                "        \"mode\": 5,\n" +
                "        \"amount\": 28,\n" +
                "        \"unit\": \"mmol/L\",\n" +
                "        \"detectTime\": \"2019-06-17 10:21:23\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    },\n" +
                "    \"hba1c\": {\n" +
                "        \"hba1cNgsp\": 7.5,\n" +
                "        \"hba1cIfcc\": 4.8,\n" +
                "        \"hba1cEag\": 2.5,\n" +
                "        \"detectTime\": \"2019-06-17 10:21:23\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    },\n" +
                "    \"BMI\": {\n" +
                "        \"height\": 165,\n" +
                "        \"weight\": 70,\n" +
                "        \"bmi\": 25,\n" +
                "        \"detectTime\": \"2019-06-18 10:21:23\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    },\n" +
                "    \"temperature\": {\n" +
                "        \"temperature\": 38.5,\n" +
                "        \"detectPosition\": 2,\n" +
                "        \"symptom\": \"头晕恶心,天旋地转\",\n" +
                "        \"detectTime\": \"2019-06-18 10:21:23\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    },\n" +
                "    \"bloodFat\": {\n" +
                "        \"cholesterol\": 2.5,\n" +
                "        \"flipidsHdl\": 2,\n" +
                "        \"flipidsTrig\": 1,\n" +
                "        \"cholHdl\": 1.3,\n" +
                "        \"flipidsLDL\": 2.1,\n" +
                "        \"detectTime\": \"2019-06-18 16:07:23\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    },\n" +
                "    \"hemoglobin\": {\n" +
                "        \"hgb\": 43,\n" +
                "        \"htc\": 79,\n" +
                "        \"rbc\": 21,\n" +
                "        \"symptom\": \"红细胞过多了，缺铁性贫血\",\n" +
                "        \"detectTime\": \"2019-06-18 16:29:23\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    },\n" +
                "    \"bloodOxygen\": {\n" +
                "        \"oxygen\": 23,\n" +
                "        \"pulse\": 79,\n" +
                "        \"detectTime\": \"2019-06-18 16:20:23\",\n" +
                "        \"deviceId\": \"KT435003A\"\n" +
                "    }\n" +
                "}", requestHeaders);

        /*HttpEntity<String> response = restTemplate.exchange(
                "http://127.0.0.1:8080/std/sign/info?",
                HttpMethod.POST, requestEntity, String.class);*/

        ResponseEntity<JSONObject> responseEntity = restTemplate.postForEntity("http://127.0.0.1:8080/std/sign/info?", requestEntity, JSONObject.class);
        if (responseEntity != null && responseEntity.getStatusCode().is2xxSuccessful()) {
            JSONObject result = responseEntity.getBody();
            /*if (StringUtils.isNotBlank(str)) {
                System.out.println(str);
            }*/
            System.out.println(result);
        }

        //response相关信息
        //String responseHeader = response.getHeaders().getFirst("MyResponseHeader");
       /* String body = response.getBody().toString();
        System.out.println(body);*/
    }
}
