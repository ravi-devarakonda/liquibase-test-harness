package liquibase.harness

import liquibase.harness.change.ChangeObjectTests
import liquibase.harness.snapshot.SnapshotObjectTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses([ChangeObjectTests, SnapshotObjectTests])
abstract class BaseHarnessSuite {
}
