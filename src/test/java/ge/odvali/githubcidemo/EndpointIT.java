package ge.odvali.githubcidemo;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeUnitRunner.class)
public class EndpointIT {

    @Test
    @Scenario("endpoint_scenario.json")
    public void endpoint_test() {
    }
}
