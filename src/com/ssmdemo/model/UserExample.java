package com.ssmdemo.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordIsNull() {
            addCriterion("certificatepassword is null");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordIsNotNull() {
            addCriterion("certificatepassword is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordEqualTo(String value) {
            addCriterion("certificatepassword =", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordNotEqualTo(String value) {
            addCriterion("certificatepassword <>", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordGreaterThan(String value) {
            addCriterion("certificatepassword >", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("certificatepassword >=", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordLessThan(String value) {
            addCriterion("certificatepassword <", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordLessThanOrEqualTo(String value) {
            addCriterion("certificatepassword <=", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordLike(String value) {
            addCriterion("certificatepassword like", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordNotLike(String value) {
            addCriterion("certificatepassword not like", value, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordIn(List<String> values) {
            addCriterion("certificatepassword in", values, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordNotIn(List<String> values) {
            addCriterion("certificatepassword not in", values, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordBetween(String value1, String value2) {
            addCriterion("certificatepassword between", value1, value2, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andCertificatepasswordNotBetween(String value1, String value2) {
            addCriterion("certificatepassword not between", value1, value2, "certificatepassword");
            return (Criteria) this;
        }

        public Criteria andIfdisableIsNull() {
            addCriterion("ifdisable is null");
            return (Criteria) this;
        }

        public Criteria andIfdisableIsNotNull() {
            addCriterion("ifdisable is not null");
            return (Criteria) this;
        }

        public Criteria andIfdisableEqualTo(Boolean value) {
            addCriterion("ifdisable =", value, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableNotEqualTo(Boolean value) {
            addCriterion("ifdisable <>", value, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableGreaterThan(Boolean value) {
            addCriterion("ifdisable >", value, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifdisable >=", value, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableLessThan(Boolean value) {
            addCriterion("ifdisable <", value, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableLessThanOrEqualTo(Boolean value) {
            addCriterion("ifdisable <=", value, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableIn(List<Boolean> values) {
            addCriterion("ifdisable in", values, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableNotIn(List<Boolean> values) {
            addCriterion("ifdisable not in", values, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableBetween(Boolean value1, Boolean value2) {
            addCriterion("ifdisable between", value1, value2, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andIfdisableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifdisable not between", value1, value2, "ifdisable");
            return (Criteria) this;
        }

        public Criteria andFirstloginIsNull() {
            addCriterion("firstlogin is null");
            return (Criteria) this;
        }

        public Criteria andFirstloginIsNotNull() {
            addCriterion("firstlogin is not null");
            return (Criteria) this;
        }

        public Criteria andFirstloginEqualTo(Boolean value) {
            addCriterion("firstlogin =", value, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginNotEqualTo(Boolean value) {
            addCriterion("firstlogin <>", value, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginGreaterThan(Boolean value) {
            addCriterion("firstlogin >", value, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("firstlogin >=", value, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginLessThan(Boolean value) {
            addCriterion("firstlogin <", value, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginLessThanOrEqualTo(Boolean value) {
            addCriterion("firstlogin <=", value, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginIn(List<Boolean> values) {
            addCriterion("firstlogin in", values, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginNotIn(List<Boolean> values) {
            addCriterion("firstlogin not in", values, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginBetween(Boolean value1, Boolean value2) {
            addCriterion("firstlogin between", value1, value2, "firstlogin");
            return (Criteria) this;
        }

        public Criteria andFirstloginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("firstlogin not between", value1, value2, "firstlogin");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}