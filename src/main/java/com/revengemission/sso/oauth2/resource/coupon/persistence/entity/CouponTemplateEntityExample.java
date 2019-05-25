package com.revengemission.sso.oauth2.resource.coupon.persistence.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponTemplateEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponTemplateEntityExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNull() {
            addCriterion("template_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("template_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("template_name =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("template_name <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("template_name >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("template_name >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("template_name <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("template_name <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("template_name like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("template_name not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("template_name in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("template_name not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("template_name between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("template_name not between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlIsNull() {
            addCriterion("cover_image_url is null");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlIsNotNull() {
            addCriterion("cover_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlEqualTo(String value) {
            addCriterion("cover_image_url =", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlNotEqualTo(String value) {
            addCriterion("cover_image_url <>", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlGreaterThan(String value) {
            addCriterion("cover_image_url >", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cover_image_url >=", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlLessThan(String value) {
            addCriterion("cover_image_url <", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlLessThanOrEqualTo(String value) {
            addCriterion("cover_image_url <=", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlLike(String value) {
            addCriterion("cover_image_url like", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlNotLike(String value) {
            addCriterion("cover_image_url not like", value, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlIn(List<String> values) {
            addCriterion("cover_image_url in", values, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlNotIn(List<String> values) {
            addCriterion("cover_image_url not in", values, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlBetween(String value1, String value2) {
            addCriterion("cover_image_url between", value1, value2, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCoverImageUrlNotBetween(String value1, String value2) {
            addCriterion("cover_image_url not between", value1, value2, "coverImageUrl");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andFullLimitIsNull() {
            addCriterion("full_limit is null");
            return (Criteria) this;
        }

        public Criteria andFullLimitIsNotNull() {
            addCriterion("full_limit is not null");
            return (Criteria) this;
        }

        public Criteria andFullLimitEqualTo(Integer value) {
            addCriterion("full_limit =", value, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitNotEqualTo(Integer value) {
            addCriterion("full_limit <>", value, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitGreaterThan(Integer value) {
            addCriterion("full_limit >", value, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_limit >=", value, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitLessThan(Integer value) {
            addCriterion("full_limit <", value, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitLessThanOrEqualTo(Integer value) {
            addCriterion("full_limit <=", value, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitIn(List<Integer> values) {
            addCriterion("full_limit in", values, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitNotIn(List<Integer> values) {
            addCriterion("full_limit not in", values, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitBetween(Integer value1, Integer value2) {
            addCriterion("full_limit between", value1, value2, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFullLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("full_limit not between", value1, value2, "fullLimit");
            return (Criteria) this;
        }

        public Criteria andFaceValueIsNull() {
            addCriterion("face_value is null");
            return (Criteria) this;
        }

        public Criteria andFaceValueIsNotNull() {
            addCriterion("face_value is not null");
            return (Criteria) this;
        }

        public Criteria andFaceValueEqualTo(BigDecimal value) {
            addCriterion("face_value =", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueNotEqualTo(BigDecimal value) {
            addCriterion("face_value <>", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueGreaterThan(BigDecimal value) {
            addCriterion("face_value >", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("face_value >=", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueLessThan(BigDecimal value) {
            addCriterion("face_value <", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("face_value <=", value, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueIn(List<BigDecimal> values) {
            addCriterion("face_value in", values, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueNotIn(List<BigDecimal> values) {
            addCriterion("face_value not in", values, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("face_value between", value1, value2, "faceValue");
            return (Criteria) this;
        }

        public Criteria andFaceValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("face_value not between", value1, value2, "faceValue");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeIsNull() {
            addCriterion("scope_of_application_type is null");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeIsNotNull() {
            addCriterion("scope_of_application_type is not null");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeEqualTo(Integer value) {
            addCriterion("scope_of_application_type =", value, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeNotEqualTo(Integer value) {
            addCriterion("scope_of_application_type <>", value, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeGreaterThan(Integer value) {
            addCriterion("scope_of_application_type >", value, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scope_of_application_type >=", value, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeLessThan(Integer value) {
            addCriterion("scope_of_application_type <", value, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("scope_of_application_type <=", value, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeIn(List<Integer> values) {
            addCriterion("scope_of_application_type in", values, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeNotIn(List<Integer> values) {
            addCriterion("scope_of_application_type not in", values, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeBetween(Integer value1, Integer value2) {
            addCriterion("scope_of_application_type between", value1, value2, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("scope_of_application_type not between", value1, value2, "scopeOfApplicationType");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationIsNull() {
            addCriterion("scope_of_application is null");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationIsNotNull() {
            addCriterion("scope_of_application is not null");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationEqualTo(String value) {
            addCriterion("scope_of_application =", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationNotEqualTo(String value) {
            addCriterion("scope_of_application <>", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationGreaterThan(String value) {
            addCriterion("scope_of_application >", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("scope_of_application >=", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationLessThan(String value) {
            addCriterion("scope_of_application <", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationLessThanOrEqualTo(String value) {
            addCriterion("scope_of_application <=", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationLike(String value) {
            addCriterion("scope_of_application like", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationNotLike(String value) {
            addCriterion("scope_of_application not like", value, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationIn(List<String> values) {
            addCriterion("scope_of_application in", values, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationNotIn(List<String> values) {
            addCriterion("scope_of_application not in", values, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationBetween(String value1, String value2) {
            addCriterion("scope_of_application between", value1, value2, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andScopeOfApplicationNotBetween(String value1, String value2) {
            addCriterion("scope_of_application not between", value1, value2, "scopeOfApplication");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeIsNull() {
            addCriterion("validity_period_type is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeIsNotNull() {
            addCriterion("validity_period_type is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeEqualTo(Integer value) {
            addCriterion("validity_period_type =", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeNotEqualTo(Integer value) {
            addCriterion("validity_period_type <>", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeGreaterThan(Integer value) {
            addCriterion("validity_period_type >", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("validity_period_type >=", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeLessThan(Integer value) {
            addCriterion("validity_period_type <", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeLessThanOrEqualTo(Integer value) {
            addCriterion("validity_period_type <=", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeIn(List<Integer> values) {
            addCriterion("validity_period_type in", values, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeNotIn(List<Integer> values) {
            addCriterion("validity_period_type not in", values, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeBetween(Integer value1, Integer value2) {
            addCriterion("validity_period_type between", value1, value2, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("validity_period_type not between", value1, value2, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursIsNull() {
            addCriterion("valid_period_hours is null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursIsNotNull() {
            addCriterion("valid_period_hours is not null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursEqualTo(Integer value) {
            addCriterion("valid_period_hours =", value, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursNotEqualTo(Integer value) {
            addCriterion("valid_period_hours <>", value, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursGreaterThan(Integer value) {
            addCriterion("valid_period_hours >", value, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_period_hours >=", value, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursLessThan(Integer value) {
            addCriterion("valid_period_hours <", value, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursLessThanOrEqualTo(Integer value) {
            addCriterion("valid_period_hours <=", value, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursIn(List<Integer> values) {
            addCriterion("valid_period_hours in", values, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursNotIn(List<Integer> values) {
            addCriterion("valid_period_hours not in", values, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursBetween(Integer value1, Integer value2) {
            addCriterion("valid_period_hours between", value1, value2, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andValidPeriodHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_period_hours not between", value1, value2, "validPeriodHours");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityIsNull() {
            addCriterion("maximum_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityIsNotNull() {
            addCriterion("maximum_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityEqualTo(Integer value) {
            addCriterion("maximum_quantity =", value, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityNotEqualTo(Integer value) {
            addCriterion("maximum_quantity <>", value, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityGreaterThan(Integer value) {
            addCriterion("maximum_quantity >", value, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("maximum_quantity >=", value, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityLessThan(Integer value) {
            addCriterion("maximum_quantity <", value, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("maximum_quantity <=", value, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityIn(List<Integer> values) {
            addCriterion("maximum_quantity in", values, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityNotIn(List<Integer> values) {
            addCriterion("maximum_quantity not in", values, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityBetween(Integer value1, Integer value2) {
            addCriterion("maximum_quantity between", value1, value2, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("maximum_quantity not between", value1, value2, "maximumQuantity");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserIsNull() {
            addCriterion("maximum_per_user is null");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserIsNotNull() {
            addCriterion("maximum_per_user is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserEqualTo(Integer value) {
            addCriterion("maximum_per_user =", value, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserNotEqualTo(Integer value) {
            addCriterion("maximum_per_user <>", value, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserGreaterThan(Integer value) {
            addCriterion("maximum_per_user >", value, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("maximum_per_user >=", value, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserLessThan(Integer value) {
            addCriterion("maximum_per_user <", value, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserLessThanOrEqualTo(Integer value) {
            addCriterion("maximum_per_user <=", value, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserIn(List<Integer> values) {
            addCriterion("maximum_per_user in", values, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserNotIn(List<Integer> values) {
            addCriterion("maximum_per_user not in", values, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserBetween(Integer value1, Integer value2) {
            addCriterion("maximum_per_user between", value1, value2, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andMaximumPerUserNotBetween(Integer value1, Integer value2) {
            addCriterion("maximum_per_user not between", value1, value2, "maximumPerUser");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedIsNull() {
            addCriterion("quantity_issued is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedIsNotNull() {
            addCriterion("quantity_issued is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedEqualTo(Integer value) {
            addCriterion("quantity_issued =", value, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedNotEqualTo(Integer value) {
            addCriterion("quantity_issued <>", value, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedGreaterThan(Integer value) {
            addCriterion("quantity_issued >", value, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity_issued >=", value, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedLessThan(Integer value) {
            addCriterion("quantity_issued <", value, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedLessThanOrEqualTo(Integer value) {
            addCriterion("quantity_issued <=", value, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedIn(List<Integer> values) {
            addCriterion("quantity_issued in", values, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedNotIn(List<Integer> values) {
            addCriterion("quantity_issued not in", values, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedBetween(Integer value1, Integer value2) {
            addCriterion("quantity_issued between", value1, value2, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andQuantityIssuedNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity_issued not between", value1, value2, "quantityIssued");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(int value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(int value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(int value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(int value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(int value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(int value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(int value1, int value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(int value1, int value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("record_status is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("record_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(int value) {
            addCriterion("record_status =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(int value) {
            addCriterion("record_status <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(int value) {
            addCriterion("record_status >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(int value) {
            addCriterion("record_status >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(int value) {
            addCriterion("record_status <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(int value) {
            addCriterion("record_status <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<Integer> values) {
            addCriterion("record_status in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<Integer> values) {
            addCriterion("record_status not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(int value1, int value2) {
            addCriterion("record_status between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(int value1, int value2) {
            addCriterion("record_status not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andSortPriorityIsNull() {
            addCriterion("sort_priority is null");
            return (Criteria) this;
        }

        public Criteria andSortPriorityIsNotNull() {
            addCriterion("sort_priority is not null");
            return (Criteria) this;
        }

        public Criteria andSortPriorityEqualTo(int value) {
            addCriterion("sort_priority =", value, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityNotEqualTo(int value) {
            addCriterion("sort_priority <>", value, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityGreaterThan(int value) {
            addCriterion("sort_priority >", value, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityGreaterThanOrEqualTo(int value) {
            addCriterion("sort_priority >=", value, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityLessThan(int value) {
            addCriterion("sort_priority <", value, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityLessThanOrEqualTo(int value) {
            addCriterion("sort_priority <=", value, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityIn(List<Integer> values) {
            addCriterion("sort_priority in", values, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityNotIn(List<Integer> values) {
            addCriterion("sort_priority not in", values, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityBetween(int value1, int value2) {
            addCriterion("sort_priority between", value1, value2, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andSortPriorityNotBetween(int value1, int value2) {
            addCriterion("sort_priority not between", value1, value2, "sortPriority");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("date_created is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("date_created is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("date_created =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("date_created <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("date_created >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("date_created >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("date_created <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("date_created <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("date_created in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("date_created not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("date_created between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("date_created not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNull() {
            addCriterion("last_modified is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNotNull() {
            addCriterion("last_modified is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedEqualTo(Date value) {
            addCriterion("last_modified =", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotEqualTo(Date value) {
            addCriterion("last_modified <>", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThan(Date value) {
            addCriterion("last_modified >", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modified >=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThan(Date value) {
            addCriterion("last_modified <", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThanOrEqualTo(Date value) {
            addCriterion("last_modified <=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIn(List<Date> values) {
            addCriterion("last_modified in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotIn(List<Date> values) {
            addCriterion("last_modified not in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBetween(Date value1, Date value2) {
            addCriterion("last_modified between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotBetween(Date value1, Date value2) {
            addCriterion("last_modified not between", value1, value2, "lastModified");
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