package teammates.e2e.cases.util;

import org.testng.annotations.Test;

import teammates.e2e.util.TestProperties;
import teammates.test.cases.BaseTestCase;

/**
 * SUT: {@link TestProperties}.
 */
public class TestPropertiesTest extends BaseTestCase {

    @Test
    public void testContent() {
        assertNotNull(TestProperties.MEC_URL);
    }

}
