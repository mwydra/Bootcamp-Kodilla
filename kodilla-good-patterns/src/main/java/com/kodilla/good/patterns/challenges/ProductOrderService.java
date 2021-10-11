package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private ProductRepository productRepository;
    private OrderService orderService;
    private InformationService informationService;

    public ProductOrderService(final ProductRepository productRepository, final OrderService orderService, final InformationService informationService) {
        this.productRepository = productRepository;
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDto orderProcess(final Order order){
        orderService.createOrder();
        informationService.inform();
        return new OrderDto();
    }
}
