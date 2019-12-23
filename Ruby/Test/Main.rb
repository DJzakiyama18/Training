require_relative 'Test2.rb'


    

users = [{name: "zakiyma", age: 18},
    {name: "aiur", age: 22},   
]

users.each do |user|
puts user[:name]
end


menu2 = Test2.new

menu2.name = "task"

puts menu2.name
puts menu2.pr1
