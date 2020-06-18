from __future__ import print_function
import sys
sys.path.insert(1,"../../")
import h2o
from tests import pyunit_utils


def test_set_system_property():
    h2o.set_system_property("sys.ai.h2o.algos.evaluate_auto_model_parameters","true")

if __name__ == "__main__":
  pyunit_utils.standalone_test(test_set_system_property)
else:
    test_set_system_property()
