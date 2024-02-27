package br.com.fiap.calculodejuros.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun CaixaDeEntrada(
    value: String,
    placeholder: String,
    label: String,
    modifier: Modifier,
    keyboardType: KeyboardType,
    atualizarValor: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = {
            atualizarValor(it)
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        placeholder = {
            Text(text = placeholder)
        },
        label = {
            Text(text = label)
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )
}