-- 코드를 입력하세요
SELECT  II.FLAVOR
FROM ICECREAM_INFO II
INNER JOIN FIRST_HALF FH ON II.FLAVOR = FH.FLAVOR
WHERE FH.TOTAL_ORDER > 3000
AND II.INGREDIENT_TYPE = 'fruit_based'
ORDER BY FH.TOTAL_ORDER DESC