class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        bag=""
        for i in range(len(digits)):
            bag+=str(digits[i])
        bag=int(bag)
        result=bag+1
        ls=[]
        for j in str(result):
            ls.append(int(j))
        return ls