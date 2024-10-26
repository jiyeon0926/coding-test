-- 코드를 입력하세요
SELECT  MEMBER_ID,
        MEMBER_NAME,
        GENDER,
        SUBSTRING(DATE_OF_BIRTH, 1, 12)
FROM MEMBER_PROFILE
WHERE SUBSTRING(DATE_OF_BIRTH, 6, 2) = 03
AND GENDER = 'W'
AND TLNO IS NOT NULL
ORDER BY MEMBER_ID