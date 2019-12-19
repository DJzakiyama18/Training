class Test2
    attr_accessor :name  
    def pr1
        return "わたしの名前は#{self.name}です"
        end 
end



test = Test2.new

 test.name = "zaki"
 puts test.name

 puts test.pr1