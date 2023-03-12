package com.example.sqprdemo2;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@GraphQLApi
@RequiredArgsConstructor
public class FoodService {



    @GraphQLQuery(name = "foods") // READ ALL
    public List<Food> getFoods() {
        return Arrays.asList(new Food(1L, "apple"), new Food(1L, "apple"),new Food(1L, "apple") );
    }

    @GraphQLQuery(name = "food") // READ BY ID
    public Optional<Food> getFoodById(@GraphQLArgument(name = "id") Long id) {
        return Optional.of(new Food(1L, "apple"));
    }

    @GraphQLMutation(name = "saveFood") // CREATE
    public Food saveFood(@GraphQLArgument(name = "food") Food food) {
        return new Food(1L, "apple");
    }

    @GraphQLQuery(name = "isGood") // Calculated property of Food
    public boolean isGood(@GraphQLContext Food food) {
        return !Arrays.asList("Avocado", "Spam").contains(food.getName());
    }

}