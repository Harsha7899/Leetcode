class Solution {
    public boolean isValid(String s) {
    
        Stack<Character> stack = new Stack<>(); 

        HashMap<Character, Character> Hm= new HashMap<>();
        Hm.put(')' , '(');
        Hm.put('}' , '{');
        Hm.put(']' , '[');

        for (int i=0; i<s.length(); i++)
        {   
            char c = s.charAt(i);
            if (Hm.containsKey(c))
            {
               char top_element = stack.empty() ? '*': stack.pop();

                if(Hm.get(c)!= top_element)
                  return false;
            }else
                stack.push(c);
                    
        }

     return stack.isEmpty();
        
    }
}