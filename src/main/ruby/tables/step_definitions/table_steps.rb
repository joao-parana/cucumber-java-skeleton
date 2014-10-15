When /^I search for available cars$/ do
  @cars = [{'colour' => 'rust', 'model' => 'Camaro'},
           {'colour' => 'blue', 'model' => 'Gremlin'}]
end

Then /^I should see the following cars:$/ do |table| table.map_headers! 'color' => 'colour'
  table.diff! @cars
end

