# Implement functionality to match delivery partners with tasks for a Quick Commerce Delivery platform

## Problem Statement
We are building a Quick Commerce Delivery platform like Swiggy or Zomato. As a part of this system we need to build a functionality which will match a delivery partner with a task.

## Requirements
* This functionality will get a list of delivery partners and a list of tasks. It will then match the delivery partners with the tasks and return a list of matched delivery partners.
* We will have access to delivery partners latest location and the pickup location of the task. The partner who is closest to the task should be matched with the task.
* Note: this is only 1 of the ways to match a partner and a task, in future we might want to match based on other criteria as well. So make sure to keep the code extensible.
* You will need to use **haversine distance formula ** to calculate the distance between partner's location and task's pickup location.
* Make sure you have basic checks in place like if the partner is already matched with a task then do not match it again.
* In case if # of partners and # of tasks are not equal, then try to match as many partners as possible.
* Once you have a list of partner task mappings, no need to persist in the database, just return the list of mappings.
