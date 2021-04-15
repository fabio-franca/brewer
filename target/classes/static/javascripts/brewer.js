var Brewer = Brewer || {};

//Criar função para máscara de dinheiro
Brewer.MaskMoney = (function() {
	function MaskMoney() {
		this.decimal = $('.js-decimal');
		this.plain = $('.js-plain');
	}

	MaskMoney.prototype.enable = function() {
		this.decimal.maskMoney({ decimal: ',', thousands: '.'});
		this.plain.maskMoney({ precision: 0, thousands: '.' });
	}	

	return MaskMoney;
	
}());

//Criar função para máscara de telefone
Brewer.MaskPhoneNumber = (function() {
	function MaskPhoneNumber() {
		this.inputPhoneNumber = $('.js-phone-number');
	}
	
	MaskPhoneNumber.prototype.enable = function() {
		var maskBehavior = function (val) {
			  return val.replace(/\D/g, '').length === 11 ? '(00) 00000-0000' : '(00) 0000-00009';
			};
			var options = {
			  onKeyPress: function(val, e, field, options) {
			      field.mask(SPMaskBehavior.apply({}, arguments), options);
			    }
			};
			
			this.inputPhoneNumber.mask(maskBehavior, options);
		
	}
	
	return MaskPhoneNumber;
}());

//Criar função para máscara de CEP
Brewer.MaskCep = (function() {
	
	function MaskCep() {
		this.inputCep = $('.js-cep');
	}
	
	MaskCep.prototype.enable = function() {
		this.inputCep.mask('00.000-000');
	}
	
	return MaskCep;
	
}());

$(function() {
	//Habilitar máscara de dinheiro
	var maskMoney = new Brewer.MaskMoney();
	maskMoney.enable();
	
	//Habilitar máscara de telefone
	var maskPhoneNumber = new Brewer.MaskPhoneNumber();
	maskPhoneNumber.enable();
	
	//Habilitar máscara de cep
	var maskCep = new Brewer.MaskCep();
	maskCep.enable();
});