-- 코드를 입력하세요
SELECT ROUND(AVG(c.DAILY_FEE), 0) AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR c
WHERE c.CAR_TYPE = 'SUV'