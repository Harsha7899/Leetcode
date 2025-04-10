class BrowserHistory {
   
    PageNode curr;

    public BrowserHistory(String homepage) {
        curr = new PageNode(homepage);
    }
    
    public void visit(String url) {
        PageNode newPage = new PageNode(url);
        curr.next = newPage;
        newPage.prev = curr;
        curr = newPage;
    }
    
    public String back(int steps) {
        while ( steps-- > 0 && curr.prev != null)
        {
            curr = curr.prev;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
           while ( steps-- > 0 && curr.next != null)
        {
            curr = curr.next;
        }
        return curr.url;
        
    }

    class PageNode{
        String url;
        PageNode prev, next;
        public PageNode(String url)
        {
            this.url = url;
            prev = next = null; 
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */