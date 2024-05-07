package work.jimmygo.springboottry.test;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author shenzui5233
 * @since 2023-10-18
 */
public class Main {
    public static void main(String[] args) {
        OrgRuleDto orgRuleDto1 = new OrgRuleDto();
        orgRuleDto1.setOrgId("1234556");
        orgRuleDto1.setSysSwitch(1);
        OrgRuleDto orgRuleDto2 = new OrgRuleDto();
        orgRuleDto2.setOrgId("1234556");
        orgRuleDto2.setSysSwitch(2);
        List<OrgRuleDto> list = Arrays.asList(orgRuleDto1, orgRuleDto2);
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(OrgRuleDto::getOrgId, OrgRuleDto::getSysSwitch, (k1, k2) -> k1));
        System.out.println(map);
    }

    @Data
    public static class OrgRuleDto {
        private String orgId;

        private Integer sysSwitch;
    }
}
